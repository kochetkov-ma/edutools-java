package edu;

import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.utils.SourceRoot;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Optional;

public final class CodeParserUtil {

    private CodeParserUtil() {
        throw new AssertionError();
    }

    public static CompilationUnit codeParse(String src, String packageName, String fileName) {
        try {
            final SourceRoot sourceRoot = new SourceRoot(Paths.get(src));
            final ParseResult<CompilationUnit> parsed = sourceRoot.tryToParse(packageName, fileName);
            return parsed.getResult().orElseThrow(() -> exception(src, packageName, fileName, null));

        } catch (IOException e) {
            throw exception(src, packageName, fileName, e);
        }
    }

    private static RuntimeException exception(String src, String packageName, String fileName, Throwable e) {
        return Optional.ofNullable(e).map(
                ex -> new RuntimeException(String.format("src '%s' package '%s' and file '%s' parsing error", src, packageName, fileName), ex)
        ).orElse(new RuntimeException(String.format("src '%s' package '%s' and file '%s' parsing error", src, packageName, fileName)));
    }
}
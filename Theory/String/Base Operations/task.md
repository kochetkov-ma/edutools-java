## Basic operation with String

## String creation

`String newString = "my string"`

- define variable `newString`
- with type `String`
- set value `"my string"`
- any String value should be surround a `quotes`

> **Good!**
>
> ```java
> String newString = "my string";
> ```

> **Bad!**
>
> _Don't use constructor._
> ```java
> String newString = new String("my string");
> ```

## String concatenation

`String newString = "left" + "right"`

- use `+` to concat two strings `"left"` and `"right"`

> Bad!
> ```java
> String newString = "string 1" + "string 2";
> ```
> _out:_ `"string 1string 2"`
>
> We **missed** space.

> Good!
> ```java
> String newString = "string 1" + " " + "string 2";
> ```
> _out:_ `"string 1 string 2"`
>
> Space here! Because we take into account and concat `" "` between our strings.

## Code

Try this code in [Main class](src/Main.java):

```java
String myStringFirst = "1";
String myStringSecond = "2";
System.out.println("Print sum of two values: 1 plus 2");
System.out.println(myStringFirst + " + " + myStringSecond + " = " + (1 + 2));
```

We say to program:
> Create variable `myStringFirst` with value string value `"1"`  
> Create variable `myStringSecond` with value string value `"2"`  
> Print some information message `"Print sum of two values: 1 plus 2"`  
> Print the expression `1 + 2 = `  
> Calculate `(1 + 2)`  
> And concat the result of calculation to expression  
> Out will be: `1 + 2 = 3`

### JDK class [String](psi_element://java.lang.String)

Using `class String` as type of defined variables.

## Internal course Links

- [Do this task](course://Task/String/Base%20Operations)

## External Links

- [Java Rush - String](https://javarush.ru/quests/lectures/en.questsyntaxpro.level09.lecture04.story)
## Console Application Interact with User

## Task

Create console application that ask user his `name`, `age` and `weight` and pretty print this information to console.

- `name` is [`String`](psi_element://java.lang.String)
- `age` is `int`
- `weight` is `double`

## Use Java capabilities

- [method String.format](psi_element://java.lang.String#format)
- [class Scanner](psi_element://java.lang.Scanner)
- [Scanner method to get String from User](psi_element://java.lang.Scanner#next)
- [Scanner method to get int from User](psi_element://java.lang.Scanner#nextInt)
- [Scanner method to get float from User](psi_element://java.lang.Scanner#nextFloat)

## `Hints`:
<div class="hint">

#### Format
```
format("User '%s' %d years old with weight %.2f kg", name, age, weight)
```

#### Scanner
```java
final Scanner scanner = new Scanner(System.in);

System.out.println("Your name: ");
final String userString = scanner.next();
```

</div>
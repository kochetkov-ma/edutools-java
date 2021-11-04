## String concatenation

---

# Task

**There is a method `String sumAB(int a, int b)` in class `Task`.**

- should return `String`
- `String` is an expression of sum `a` and `b`  
- result should be like this pattern `a + b = sum`
  - where `a` is first method parameter
  - where `b` is second method parameter
  - where `sum` is math sum value of `a` and `b`

## Example:
**`When` input is**
```
a = 1
b = 2
```

**`And` method will be invoked as** `thisTask(1, 2); `

**`Then` output should be** `1 + 2 = 3`

---

## Extra information

### Java capabilities

- [method String.concat](psi_element://java.lang.String#startsWith)

## `Hints`:
<div class="hint">

- use bracket for calculate sum before concat: `... + (a + b)`
- use `+` for concat, don't forget about pretty expression with `+` and `=`
- `a + "+" + b ...`

</div>
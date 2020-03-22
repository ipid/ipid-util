<h1 align=center>ipid-util</h1>
<p align=center>My common, open-source utilities. Support Java 8+.</p>
<br>

## What's included

#### Tupling: Tuple library

The project contains Tupling, a non-nullable, type-safe tuple library for Java. Though projects like [commons-lang3](http://commons.apache.org/proper/commons-lang/), [javatuples](https://www.javatuples.org/) have already provided similar tuple libraries, they did not provide features like:

- Support up to 26 tuples
  - Can't be more because there are too few letters in English
- Null checking
- Tuple concatenation
- Public final field for elements
- Shortened member accessing codes

When using **javatuples**, you'll have to write something like:

```java
// p is a Pair<A, B>
p.getLeft().someOperation();
```

But with Tupling, all you need to do is simply:

```java
p.a.someOperation();
```

Such feature shortens your code.

And since Optional<T> is shipping since Java 8, there is no need for `null` in Java. Tupling provides null checking:

```java
// Throws NullPointerException using Tupling
Tuple2.of(null, "123");

// Nothing throws with Apache Commons Lang or javatuples
Pair.with(null, "123");
```

**Attention:** The code is automatically generated. Modify those template files named `*.jinja` under `/scripts/generate-tuple-code`, if you want to make some changes.

<br>

## License

The project is released under MIT license.

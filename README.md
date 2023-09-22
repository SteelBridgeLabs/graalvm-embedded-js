# Instructions

# Compile project

```bash
mvn clean verify
```

# Create Docker image

```bash
(cd target && docker build -t graalvm-embedded-js .)
```

# Run Docker image

```bash
docker run --rm -it graalvm-embedded-js
```

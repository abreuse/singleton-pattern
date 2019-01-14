## Singleton pattern

Simple example of the Singleton pattern.
- The `ATM` is the singleton, only one instance can be used during the lifetime of the app.

Singleton pattern VS static class :
- better for testing
- better when keeping a state
- can be lazy-loaded
- it's an object

static class is better when a class is an utility class like `Math`.
Static methods are bound compile.

**Les plus :**
- Permet d'avoir une unique instance
- Peut être lazy-loaded
- Mockable
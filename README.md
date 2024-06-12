Repro for CLJ-2863:

Compile the Java and Clojure source:

```
$ clj -T:build compile
Reflection warning, main.clj:8:3 - call to static method overload on Receiver can't be resolved (argument types: unknown).
```

Run:
```
$ clj -M:run
Execution error (ClassCastException) at main__init/load (REPL:8).
class clojure.lang.Var$Unbound cannot be cast to class java.lang.ClassLoader (clojure.lang.Var$Unbound is in unnamed module of loader 'app'; java.lang.ClassLoader is in module java.base of loader 'bootstrap')
```

This may not be reproducible every time as it depends on the reflective overload matching the Function case and not the Map case (the passed arg implements both).

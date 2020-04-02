# problems


for an ordering of:

```
maven {url = uri("https://repo.locationtech.org/content/groups/releases")}
jcenter()
```

compilation has many errors / warnings

```bash
gradle compilescala

[Fatal Error] spark-core_2.11-2.3.4.pom:7:3: Elementtyp "hr" muss mit dem entsprechenden Endtag "</hr>" beendet werden.
[Fatal Error] scala-library-2.11.12.pom:7:3: Elementtyp "hr" muss mit dem entsprechenden Endtag "</hr>" beendet werden.


....
```

otherwise, no problems i.e.

```
jcenter()
maven {url = uri("https://repo.locationtech.org/content/groups/releases")}
```

works just fine!

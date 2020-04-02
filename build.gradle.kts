plugins {
    scala
}

repositories {
    jcenter()
    maven { url = uri("https://repo.locationtech.org/content/groups/releases")}
    maven { url = uri("http://repo.boundlessgeo.com/main") }
    maven { url = uri("http://download.osgeo.org/webdav/geotools") }
    //maven { url = uri("http://conjars.org/repo") }
}

dependencies {
    implementation("org.scala-lang:scala-library:2.11.12")
    compile("org.locationtech.geomesa:geomesa-spark-sql_2.11:2.4.0")
    compileOnly ("org.apache.spark:spark-core_2.11:2.3.4")
    // compile("org.datasyslab:geospark:1.3.1")
    // compile("org.datasyslab:geospark-sql_2.3:1.3.1")
}

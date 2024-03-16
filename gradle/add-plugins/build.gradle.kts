//add plugins block
plugins{
    id("java")
    id("org.flywaydb.flyway") version "6.3.2"
}

tasks.register("hello"){
    description = "This is Hello task developed by SKG"
    doFirst{
        print("Hello!")
    }
}
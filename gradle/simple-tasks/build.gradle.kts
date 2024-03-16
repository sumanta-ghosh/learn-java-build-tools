
plugins {
    id("java")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17 // Specify the Java version you want to use
    targetCompatibility = JavaVersion.VERSION_17 // Specify the target Java version if needed
}


println("This is executed during the configuration phase.")

tasks.register("configured") {
    println("This is also executed during the configuration phase, because :configured is used in the build.")
}

tasks.register("hello"){

    doLast{
        print("Sumanta")
    }

    doFirst{
        print("Hello!! ")
    }

    println("This is executed during the configuration phase as well from :hello task")

}
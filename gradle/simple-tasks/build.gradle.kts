tasks.register("hello"){

    doLast{
        print("Sumanta")
    }

    doFirst{
        print("Hello!!")
    }
    
}
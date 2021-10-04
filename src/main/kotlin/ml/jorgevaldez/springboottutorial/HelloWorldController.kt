package ml.jorgevaldez.springboottutorial

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {
//    fun helloWorld(): String{
//        return "Hello, this is a REST endpoint"
//    }
    @GetMapping
    fun helloWorld(): String = "Hello, this is a REST endpoint"
}
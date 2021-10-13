package ml.jorgevaldez.springboottutorial.controller

import ml.jorgevaldez.springboottutorial.datasource.BankDataSource
import ml.jorgevaldez.springboottutorial.datasource.mock.MockBankDataSource
import ml.jorgevaldez.springboottutorial.model.Bank
import ml.jorgevaldez.springboottutorial.service.BankService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/banks")
class BankController(private val bankService: BankService) {

    @ExceptionHandler(NoSuchElementException::class)
    fun handleNotFound(e: NoSuchElementException): ResponseEntity<String> =
        ResponseEntity(e.message, HttpStatus.NOT_FOUND)


    @GetMapping
    fun getBanks(): Collection<Bank> = bankService.getBanks()

    @GetMapping("/{accountNumber}")
    fun getBank(@PathVariable accountNumber: String) = bankService.getBank(accountNumber)
}
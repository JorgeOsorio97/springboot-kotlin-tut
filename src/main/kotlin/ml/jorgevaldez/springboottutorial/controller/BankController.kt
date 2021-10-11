package ml.jorgevaldez.springboottutorial.controller

import ml.jorgevaldez.springboottutorial.datasource.BankDataSource
import ml.jorgevaldez.springboottutorial.datasource.mock.MockBankDataSource
import ml.jorgevaldez.springboottutorial.model.Bank
import ml.jorgevaldez.springboottutorial.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/banks")
class BankController(private val bankService: BankService) {

    @GetMapping
    fun getBanks(): Collection<Bank>{
        return bankService.getBanks()
    }
}
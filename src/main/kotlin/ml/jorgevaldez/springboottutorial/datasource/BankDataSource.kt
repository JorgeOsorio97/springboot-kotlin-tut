package ml.jorgevaldez.springboottutorial.datasource

import ml.jorgevaldez.springboottutorial.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}
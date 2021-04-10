package com.example.specfirstopenapi.rest

import com.example.api.apis.PetsApi
import com.example.api.models.Pet
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class PetController : PetsApi {
    override fun createPets(): ResponseEntity<Unit> {
        TODO("call a service or sth idk")
    }

    override fun listPets(limit: Int?): ResponseEntity<List<Pet>> {
        TODO("call a service or sth idk")
    }

    override fun showPetById(petId: String): ResponseEntity<Pet> {
        TODO("call a service or sth idk")
    }
}

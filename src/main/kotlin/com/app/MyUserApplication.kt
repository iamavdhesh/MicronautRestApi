package com.app

import io.micronaut.runtime.Micronaut

object MyUserApplication {

	@JvmStatic
    fun main(args: Array<String>) {
        Micronaut.run(MyUserApplication::class.java,*args)
    }

}


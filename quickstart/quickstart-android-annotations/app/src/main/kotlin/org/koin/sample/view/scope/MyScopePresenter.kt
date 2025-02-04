package org.koin.sample.view.scope

import org.koin.core.annotation.Scope
import org.koin.sample.HelloRepository

/**
 *  A presenter that will be scoped (declared as single but drop later)
 *  - consumes HelloRepository data
 */
@Scope(MyScopeActivity::class)
class MyScopePresenter(val repo: HelloRepository) {

    fun sayHello() = "${repo.giveHello()} from MyScopePresenter"
}
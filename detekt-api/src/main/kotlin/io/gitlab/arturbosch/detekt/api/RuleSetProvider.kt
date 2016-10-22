package io.gitlab.arturbosch.detekt.api

/**
 * @author Artur Bosch
 */
interface RuleSetProvider {
	fun instance(config: Config): RuleSet
}
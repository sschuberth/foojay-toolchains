/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package org.gradle.disco

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.jvm.toolchain.JavaToolchainRequest
import org.gradle.jvm.toolchain.JavaToolchainResolver
import org.gradle.jvm.toolchain.JavaToolchainDownload
import java.util.*

abstract class DiscoToolchainsPlugin: Plugin<Settings>, JavaToolchainResolver {

    override fun apply(settings: Settings) {
        //todo
    }

    override fun resolve(request: JavaToolchainRequest): Optional<JavaToolchainDownload> {
        TODO("Not yet implemented")
    }

}
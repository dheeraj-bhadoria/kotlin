// DO NOT EDIT MANUALLY!
// Generated by org/jetbrains/kotlin/generators/arguments/GenerateGradleOptions.kt
// To regenerate run 'generateGradleOptions' task
@file:Suppress("RemoveRedundantQualifierName", "Deprecation", "DuplicatedCode")

package org.jetbrains.kotlin.gradle.dsl

@Deprecated("Use CompilerCommonOptions instead", level = DeprecationLevel.WARNING)
interface KotlinCommonOptions : org.jetbrains.kotlin.gradle.dsl.KotlinCommonToolOptions {
    override val options: org.jetbrains.kotlin.gradle.dsl.CompilerCommonOptions

    private val kotlin.String?.apiVersionCompilerOption get() = if (this != null) org.jetbrains.kotlin.gradle.dsl.KotlinVersion.fromVersion(this) else null

    private val org.jetbrains.kotlin.gradle.dsl.KotlinVersion?.apiVersionKotlinOption get() = this?.version

    /**
     * Allow using declarations only from the specified version of bundled libraries
     * Possible values: "1.3 (deprecated)", "1.4 (deprecated)", "1.5", "1.6", "1.7", "1.8", "1.9 (experimental)"
     * Default value: null
     */
    var apiVersion: kotlin.String?
        get() = options.apiVersion.orNull.apiVersionKotlinOption
        set(value) = options.apiVersion.set(value.apiVersionCompilerOption)

    private val kotlin.String?.languageVersionCompilerOption get() = if (this != null) org.jetbrains.kotlin.gradle.dsl.KotlinVersion.fromVersion(this) else null

    private val org.jetbrains.kotlin.gradle.dsl.KotlinVersion?.languageVersionKotlinOption get() = this?.version

    /**
     * Provide source compatibility with the specified version of Kotlin
     * Possible values: "1.3 (deprecated)", "1.4 (deprecated)", "1.5", "1.6", "1.7", "1.8", "1.9 (experimental)"
     * Default value: null
     */
    var languageVersion: kotlin.String?
        get() = options.languageVersion.orNull.languageVersionKotlinOption
        set(value) = options.languageVersion.set(value.languageVersionCompilerOption)

    /**
     * Compile using experimental K2. K2 is a new compiler pipeline, no compatibility guarantees are yet provided
     * Default value: false
     */
    var useK2: kotlin.Boolean
        get() = options.useK2.get()
        set(value) = options.useK2.set(value)
}

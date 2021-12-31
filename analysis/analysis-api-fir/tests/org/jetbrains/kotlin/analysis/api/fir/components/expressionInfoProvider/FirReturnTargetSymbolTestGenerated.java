/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.components.expressionInfoProvider;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.impl.barebone.test.FrontendApiTestConfiguratorService;
import org.jetbrains.kotlin.analysis.api.fir.FirFrontendApiTestConfiguratorService;
import org.jetbrains.kotlin.analysis.api.impl.base.test.components.expressionInfoProvider.AbstractReturnTargetSymbolTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link GenerateNewCompilerTests.kt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/components/expressionInfoProvider/returnExpressionTargetSymbol")
@TestDataPath("$PROJECT_ROOT")
public class FirReturnTargetSymbolTestGenerated extends AbstractReturnTargetSymbolTest {
    @NotNull
    @Override
    public FrontendApiTestConfiguratorService getConfigurator() {
        return FirFrontendApiTestConfiguratorService.INSTANCE;
    }

    @Test
    public void testAllFilesPresentInReturnExpressionTargetSymbol() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/components/expressionInfoProvider/returnExpressionTargetSymbol"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("labeledReturn.kt")
    public void testLabeledReturn() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionInfoProvider/returnExpressionTargetSymbol/labeledReturn.kt");
    }

    @Test
    @TestMetadata("normalReturn.kt")
    public void testNormalReturn() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionInfoProvider/returnExpressionTargetSymbol/normalReturn.kt");
    }

    @Test
    @TestMetadata("unresolvedReturn.kt")
    public void testUnresolvedReturn() throws Exception {
        runTest("analysis/analysis-api/testData/components/expressionInfoProvider/returnExpressionTargetSymbol/unresolvedReturn.kt");
    }
}

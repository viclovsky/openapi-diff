package com.qdesrame.openapi.test;

import org.junit.Test;

import static com.qdesrame.openapi.test.TestUtils.assertOpenApiAreEquals;

public class PathDiffTest {

    private final String OPENAPI_PATH1 = "path_1.yaml";
    private final String OPENAPI_PATH2 = "path_2.yaml";
    private final String OPENAPI_PATH3 = "path_3.yaml";

    @Test
    public void testEqual() {
        assertOpenApiAreEquals(OPENAPI_PATH1, OPENAPI_PATH2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMultiplePathWithSameSignature() {
        assertOpenApiAreEquals(OPENAPI_PATH3, OPENAPI_PATH3);
    }

}

package com.ban.indro

class GrapeTester extends GroovyTestCase {
    //
    // Tests
    //
    void testMasterPipelineHappyPath() {
	println "Executing test:::::::::::::::"
        def grpTest = new GrapeTest(pipeline)
        assert 'Working::::::::::::::::::::' == grpTest.meth1()
    }
}
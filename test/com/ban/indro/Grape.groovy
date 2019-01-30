package com.ban.indro

class GrapeIndroTest extends GroovyTestCase {

    //
    // Tests
    //
  void testMasterPipelineHappyPath() {
       println "Executing test:::::::::::::::"
	def gg = new GrapeTest()
	println "?????????????????????"+gg.meth1();
    assert 'Working::::::::::::::::::::' == gg.meth1()
	println "Operation done:::"
    }
  
}

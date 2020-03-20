package WebMotorsTesteWeb;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TesteBuscaMarcaHonda.class,
	TesteBuscaModeloCity.class,
	TesteBuscaVersao.class,
	TesteBuscaEstoque.class
})

public class ASuiteRunnerTest {
	
}

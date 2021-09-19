package design_patterns_cod3r.Criacao.factory.app.dbadapter.after.factory;

import design_patterns_cod3r.Criacao.factory.app.dbadapter.after.db.DB;
import design_patterns_cod3r.Criacao.factory.app.dbadapter.after.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}

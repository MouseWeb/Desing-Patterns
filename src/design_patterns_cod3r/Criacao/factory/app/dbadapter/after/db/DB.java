package design_patterns_cod3r.Criacao.factory.app.dbadapter.after.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}

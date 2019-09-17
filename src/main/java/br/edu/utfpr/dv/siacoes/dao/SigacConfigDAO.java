package br.edu.utfpr.dv.siacoes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.utfpr.dv.siacoes.log.UpdateEvent;
import br.edu.utfpr.dv.siacoes.model.SigacConfig;
import br.edu.utfpr.dv.siacoes.model.SigesConfig;

public class SigacConfigDAO extends TemplateDAO<SigacConfig>{
	
	public SigacConfig findByDepartment(int idDepartment) throws SQLException{
		return findById(idDepartment);
	}
	
	public int save(int idUser, SigacConfig config) throws SQLException {

		save(idUser, config, config.getDepartment().getIdDepartment());

		return config.getDepartment().getIdDepartment();
	}

	@Override
	protected String getSelectByIdSQL() {
		return "SELECT * FROM sigacconfig WHERE idDepartment = ?";
	}

	@Override
	protected String getInsertSQL() {
		return "INSERT INTO sigacconfig(minimumScore, maxfilesize, idDepartment) VALUES(?, ?, ?)";
	}

	@Override
	protected String getUpdateSQL() {
		return "UPDATE sigacconfig SET minimumScore=?, maxfilesize=? WHERE idDepartment=?";
	}

	@Override
	protected String getSelectSQL() {
		return "SELECT * FROM sigacconfig";
	}

	@Override
	protected String getDeleteSQL() {
		return "DELETE FROM sigacconfig WHERE idDepartment = ?";
	}

	@Override
	protected void setStatement(PreparedStatement stmt, SigacConfig config) throws SQLException {
		stmt.setDouble(1, config.getMinimumScore());
		stmt.setInt(2, config.getMaxFileSize());
		stmt.setInt(3, config.getDepartment().getIdDepartment());
	}

	@Override
	protected SigacConfig loadObject(ResultSet rs) throws SQLException{
		SigacConfig config = new SigacConfig();
		
		config.getDepartment().setIdDepartment(rs.getInt("idDepartment"));
		config.setMinimumScore(rs.getDouble("minimumScore"));
		config.setMaxFileSize(rs.getInt("maxfilesize"));
		
		return config;
	}

}

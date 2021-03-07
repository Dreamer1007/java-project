package Interface;

import java.sql.SQLException;

import Universite.Universite;

public interface IUniversiteRepository {
	Universite GetById(int universityId) throws SQLException;
}

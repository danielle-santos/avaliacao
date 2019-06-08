package br.com.etechoracio.avaliacao.bussiness;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.avaliacao.dao.SoftwareDAO;
import br.com.etechoracio.avaliacao.model.Software;
import br.com.etechoracio.common.business.BaseSB;

@Service
public class SoftwareSB extends BaseSB{
	
	
	private SoftwareDAO SoftwareDAO;
	
	protected void postConstructImpl() {
		SoftwareDAO = getDAO(SoftwareDAO.class);
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void save (Software software) {
		SoftwareDAO.save(software);
	}

	public static Object getTarget() {
		// TODO Auto-generated method stub
		return null;
	}
}
		
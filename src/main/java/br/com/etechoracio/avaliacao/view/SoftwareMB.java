package br.com.etechoracio.avaliacao.view;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import br.com.etechoracio.avaliacao.bussiness.SoftwareSB;
import br.com.etechoracio.avaliacao.model.Software;
import br.com.etechoracio.common.view.BaseMB;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
@Scope("view")
public class SoftwareMB extends BaseMB {
	

	@Autowired
	private SoftwareSB softwareSB;

	private Software edit = new Software();
	
	public void onSave() {
		try {
			softwareSB.save(edit);
			showInsertMessage();

		} catch (Exception e) {
			showErrorMessage(e.getMessage());
		}
	}
}	
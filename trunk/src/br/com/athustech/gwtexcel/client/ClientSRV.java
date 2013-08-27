package br.com.athustech.gwtexcel.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("servletGwtExcel")
public interface ClientSRV extends RemoteService {

//	List<UsuarioENT> listarUsuario(String usuario, int pagina);
//	String salvarUsuario(int idUnidade, String ativo, String usuario, String nomeCompleto, String senha, List<PerfilENT> perfilUsuarioENT, List<UnidadeENT> listUnidadeENT, String email, boolean enviarEmail, String descricao);

	
	public static class Instance {
		private static ClientSRVAsync instance;
		public static ClientSRVAsync getInstance() {
			if (instance == null) {
				instance = (ClientSRVAsync) GWT.create(ClientSRV.class);
			}
			return instance;
		}
	}	

}



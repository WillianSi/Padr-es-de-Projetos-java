package willian;

public interface IComteudo {
	public void inscrever(IAssinante assinante);
	public void desinscrever(IAssinante assinante);
	public void atualizar(float temperatura,float vento, float umidade, boolean chuva);
}

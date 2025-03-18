package unidade3.persistencia;

public interface IDAO<T> {

	public void create(T entity);

	public void read(T entity);

	public void update(T entity);

	public void delete(T entity);

}

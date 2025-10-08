package dao;

public interface IDao {
    default double getData() {
        return 0;
    }
}

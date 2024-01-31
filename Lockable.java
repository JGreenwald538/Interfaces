public interface Lockable {
    void lock(int key);
    void unlock(int key);
    boolean locked();
    void setKey(int key);
}
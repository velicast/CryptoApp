package co.edu.unal.crypto.cryptosystem;

public interface Cipher<P, C, K> {

    public C[] encrypt(K key, P[] input);

    public P[] decrypt(K key, C[] input);
}

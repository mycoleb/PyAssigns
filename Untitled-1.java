public interface DictionaryInterface<K, V> {
    // Check if the dictionary is empty
    boolean isEmpty();
    
    // Get the number of entries in the dictionary
    int getSize();
    
    // Clear all entries from the dictionary
    void clear();
    
    // Add a new key-value pair to the dictionary. If the key already exists, update its value.
    V add(K key, V value);
    
    // Remove the entry with the given key from the dictionary and return its value.
    V remove(K key);
    
    // Get the value associated with a given key.
    V getValue(K key);
    
    // Check if the dictionary contains an entry with the given key.
    boolean contains(K key);
    
    // Get an iterator over the keys in the dictionary.
    Iterator<K> getKeyIterator();
    
    // Get an iterator over the values in the dictionary.
    Iterator<V> getValueIterator();
    
    // Display the contents of the hash table for debugging purposes.
    void displayHashTable();
    
    // Get the number of probes made during the last operation. Useful for performance analysis.
    int getProbes();
    
    // Reset the probe count to 0. Should be called before starting a new operation.
    void resetProbeCount();
}

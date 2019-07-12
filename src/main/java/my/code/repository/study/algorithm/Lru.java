package my.code.repository.study.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * This is lru algorithm simple implement, the main thought think the recent use data
 * at the future will also more likely use.
 * <p>
 * The will put the new data to the head of link, and the recent use data also move to
 * the head of link, if the cache size is max than the max size, the last data of the
 * link will remove.
 *
 * @author djh on  2018/9/17 15:27
 * @E-Mail 1544579459@qq.com
 */
@SuppressWarnings("ALL")
public class Lru<K, V> {

    private int mMaxSize;

    private Node mLastNode;
    private Node mFirstNode;

    private Map<K, Node> mNodes;

    private Lru(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("The max size must big than zero!");
        }
        mMaxSize = maxSize;
        mNodes = new HashMap<>(mMaxSize);
    }

    /**
     * Recent put node is at the head of link, if cache size is max than the maxSize,
     * the last node will remove.
     */
    public void put(K key, V value) {
        Node node = mNodes.get(key);
        if (node == null) {
            // Put the new item.
            node = new Node(key, value);
            mNodes.put(key, node);

            // If the cache size more then max size, remove the last item.
            if (mNodes.size() > mMaxSize) {
                mNodes.remove(mLastNode.key);
                removeLast();
            }
        }
        node.value = value;
        moveToFirst(node);
    }

    /**
     * Recent used node will move to the link head.
     */
    public V get(K key) {
        Node node = mNodes.get(key);
        if (node == null) {
            return null;
        }
        moveToFirst(node);
        return node.value;
    }

    public V remove(K key) {
        Node node = mNodes.remove(key);
        if (node == null) {
            return null;
        }
        // If the node is middle node, simple remove.
        if (node.mPreNode != null && node.mNextNode != null) {
            node.mPreNode.mNextNode = node.mNextNode;
            node.mNextNode.mPreNode = node.mPreNode;
            return node.value;
        }
        // If the node is first node.
        if (node.mPreNode == null) {
            mFirstNode = node.mNextNode;
            node.mNextNode.mPreNode = null;
            return node.value;
        }
        // If the node is last node.
        node.mPreNode.mNextNode = null;
        return node.value;

    }

    private void removeLast() {
        mLastNode = mLastNode.mPreNode;
        // The cache size may is 1, so will need do this.
        if (mLastNode == null) {
            mFirstNode = null;
        } else {
            mLastNode.mNextNode = null;
        }
    }

    private void moveToFirst(Node node) {
        // If the node is fist.
        if (node == mFirstNode) {
            return;
        }
        // If the node is last node.
        if (node == mLastNode) {

            mLastNode = node.mPreNode;

            node.mPreNode.mNextNode = null;
            node.mPreNode = null;

            node.mNextNode = mFirstNode;
            mFirstNode.mPreNode = node;
            mFirstNode = node;
            return;
        }
        // If the node is middle node.
        if (node.mNextNode != null && node.mPreNode != null) {
            node.mPreNode.mNextNode = node.mNextNode;
            node.mNextNode.mPreNode = node.mPreNode;

            node.mPreNode = null;
            node.mNextNode = mFirstNode;
            mFirstNode.mPreNode = node;
            mFirstNode = node;
            return;
        }

        // If first or last is null, init the first and last node.
        if (mFirstNode == null || mLastNode == null) {
            mFirstNode = mLastNode = node;
            return;
        }

        // Move the node to the first node.
        node.mNextNode = mFirstNode;
        mFirstNode.mPreNode = node;
        mFirstNode = node;
    }

    private class Node {
        private Node mPreNode;
        private Node mNextNode;
        private K key;
        private V value;

        private Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Node currentNode = mFirstNode;
        stringBuilder.append("[");

        while (currentNode != null) {
            stringBuilder.append(currentNode.key)
                    .append(":")
                    .append(currentNode.value)
                    .append(", ");
            currentNode = currentNode.mNextNode;
        }
        return stringBuilder.substring(0, stringBuilder.lastIndexOf(", ")) + "]";
    }

    public static void main(String[] args) {
        Lru<Integer, String> lru = new Lru<>(3);
        lru.put(1, "a");
        lru.put(2, "b");
        lru.put(3, "c");
        lru.put(4, "d");
        lru.put(5, "e");
        System.out.println(lru);
        lru.get(3);
        lru.get(4);
        lru.put(8, "Success!");
        System.out.println(lru);
        lru.remove(8);
        lru.put(66, "Fax!");
        System.out.println(lru);
    }
}

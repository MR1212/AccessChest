package ato.accesschest.repository;

import net.minecraft.item.ItemStack;

/**
 * リポジトリのデータ管理に必要な機能のインターフェースを定義する
 */
public abstract class DataManager {

    protected String name;

    public abstract void setItem(int index, ItemStack is);

    public abstract ItemStack getItem(int index);

    public abstract int getMaxSize();

    public abstract ComparatorAtoChest getComparator();

    public abstract String getName();

    public abstract void setName(String name);
}

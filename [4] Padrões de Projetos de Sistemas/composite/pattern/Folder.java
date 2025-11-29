package composite.pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
    private String name;
    private List<FileSystemItem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+ Pasta: " + name);

        for (FileSystemItem child : children) {
            child.print(indent + "  ");
        }
    }
}
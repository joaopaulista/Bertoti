package composite.antipattern;

import java.util.ArrayList;
import java.util.List;

public class FolderCoupled {
    private String name;

    private List<FileCoupled> files = new ArrayList<>();
    private List<FolderCoupled> subFolders = new ArrayList<>();

    public FolderCoupled(String name) {
        this.name = name;
    }

    public void addFile(FileCoupled file) {
        files.add(file);
    }

    public void addFolder(FolderCoupled folder) {
        subFolders.add(folder);
    }

    public void printStructure() {
        System.out.println("+ Pasta: " + name);

        for (FileCoupled file : files) {
            System.out.print("  ");
            file.printFile();
        }

        for (FolderCoupled folder : subFolders) {
            System.out.print("  ");
            folder.printStructure();
        }
    }
}
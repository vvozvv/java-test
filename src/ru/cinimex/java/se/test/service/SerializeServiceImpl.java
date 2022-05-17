package ru.cinimex.java.se.test.service;

import ru.cinimex.java.se.test.entity.OperationType;

import java.io.*;

public class SerializeServiceImpl implements SerializeService {
    String typesFileUrl;

    public SerializeServiceImpl(String typesFileUrl) {
        this.typesFileUrl = typesFileUrl;
    }

    @Override
    public void serializeOperationType(OperationType operationType) {
        ObjectOutputStream oos = null;
        File fil = new File(this.typesFileUrl);
        try {
            FileOutputStream fos = new FileOutputStream(fil);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(operationType);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public OperationType deserializeOperationType() {
        ObjectInputStream objectInputStream = null;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(this.typesFileUrl);
            objectInputStream = new ObjectInputStream(fileInputStream);
            System.out.println(objectInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}

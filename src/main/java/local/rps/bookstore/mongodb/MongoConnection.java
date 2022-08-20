package local.rps.bookstore.mongodb;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Iterator;

public class MongoConnection {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);

        System.out.println("hi bitches");
        MongoDatabase db = mongoClient.getDatabase("bookstore");

        MongoCollection<Document> collection = db.getCollection("author");

        FindIterable<Document> iterDoc = collection.find();
        System.out.println("Listing all the documents: ");
        Iterator it = iterDoc.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("name", "Haruki Murakami");
        MongoCursor<Document> cursor = collection.find(searchQuery).iterator();
        System.out.println(cursor.next());

    }
}

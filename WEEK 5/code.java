//mYSERVER
import java.io.*;
import java.net.*;
public class MyServer {
public static void main(String[] args) {
try {
// Create the server socket without automatically binding to a port
ServerSocket ss = new ServerSocket();
// Bind the server socket to a specific IP address and port number
ss.bind(new InetSocketAddress("192.168.46.246", 12345)); // Assuming port 6666. You can
replace it with your desired port.
// Listen for an incoming connection
Socket s = ss.accept();
// Read a message from the connected client
DataInputStream dis = new DataInputStream(s.getInputStream());
String str = (String) dis.readUTF();
System.out.println("message= " + str);
// Close the server socket
ss.close();
} catch (Exception e) {
System.out.println(e);



//MYClient
import java.io.*;
import java.net.*;
public class MyClient {
public static void main(String[] args) {
try {
// Specify the IP address of the server you want to connect to
String serverIpAddress = "192.168.46.157";
// Create a socket connection to the specified server and port (assuming port 12345 in this 
case)
Socket s = new Socket(serverIpAddress, 12345);
// Create a data output stream to send data to the server
DataOutputStream dout = new DataOutputStream(s.getOutputStream());
// Send a message to the server
dout.writeUTF("Hello Server from prafull");
// Flush and close the output stream and socket
dout.flush();
dout.close();
s.close();
} catch (Exception e) {
System.out.println(e);
}
}

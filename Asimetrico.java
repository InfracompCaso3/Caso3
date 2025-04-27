
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;

public class Asimetrico {

    public static byte[] firmar(byte[] datos, PrivateKey privateKey) throws Exception {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);
        signature.update(datos);
        return signature.sign();
    }

    public static boolean verificar(byte[] datos, byte[] firma, PublicKey publicKey) throws Exception {
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initVerify(publicKey);
        signature.update(datos);
        return signature.verify(firma);
    }
}

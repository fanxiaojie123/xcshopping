package cn.axy.xc.xcitemdetailconsumer.controller;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.nio.charset.Charset;

@Controller
public class ConsumerUploadController {
    // 设置要进行远程上传微服务调用的代理地址
    public static final String UPLOAD_URL = "http://localhost:7051/upload";
    @RequestMapping(value = "/consumer/uploadPre", method = RequestMethod.GET)
    public String uploadPre() {
        return "upload";
    }
    @RequestMapping(value = "/consumer/upload", method = RequestMethod.POST)
    public @ResponseBody
    String upload(String name, MultipartFile photo) throws Exception {
        if (photo != null) {
            CloseableHttpClient httpClient = HttpClients.createDefault(); // 创建一个HttpClient对象
            HttpClientContext httpContext = HttpClientContext.create(); // 创建Http处理操作的上下文对象
            HttpPost httpPost = new HttpPost(UPLOAD_URL); // 设置要进行访问的请求地址
            String s = System.currentTimeMillis()+ ".jpg";
            HttpEntity entity = MultipartEntityBuilder.create()
                    .addBinaryBody("photo", photo.getBytes(),
                            ContentType.create("image/jpeg"), s)
                    .build();
            httpPost.setEntity(entity);    // 将请求的实体信息进行发送
            HttpResponse response = httpClient.execute(httpPost, httpContext) ;    // 执行请求的发送
            return EntityUtils.toString(response.getEntity(),Charset.forName("UTF-8")) ;
//       return "【*** 消费端 ***】name = " + name + "、photoName = "
//             + photo.getOriginalFilename() + "、ContentType = "
//             + photo.getContentType();
        }
        return "23";
    }
}



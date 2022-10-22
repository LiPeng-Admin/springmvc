package com.atguigu.mvc.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * @author lipeng
 * @version 1.0
 * @description: springMVC实现文件的下载
 * @date 2022/10/18 22:43
 */
@Controller
public class FileUpAndDownloadController {
    @RequestMapping("/testDown")
    public ResponseEntity<byte[]> testDown(HttpSession session) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        //获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("/static/img/test.png");
        System.out.println(realPath);
        //创建输入流
        FileInputStream fileInputStream = new FileInputStream(realPath);
        //创建字节数组
        byte[] bytes = new byte[fileInputStream.available()];
        //将流读到字节数组中
        fileInputStream.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment; filename=test.png");
        //设置响应状态码
        HttpStatus status = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, status);
        //关闭输入流
        fileInputStream.close();
        return responseEntity;


    }
    @RequestMapping("/testUp")
    public String testUp(MultipartFile photo,HttpSession session) throws Exception{
//        System.out.println(photo.getName());
//        System.out.println(photo.getOriginalFilename());// test.png""
        //获取文件上传的文件名
        String filename = photo.getOriginalFilename();
        //获取上传的文件后缀名
        String suffixName=filename.substring(filename.lastIndexOf("."));
        //将uuid 作为文件名
        String uuid = UUID.randomUUID().toString();
        //将uuid和文件的后缀名作为将要上传的文件名
        filename=uuid+suffixName;
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取服务器中文件的真实路径(上传到服务器的位置)
        String photoPath = servletContext.getRealPath("photo");
        File file=new File(photoPath);
        System.out.println(file);
        //判断photoPath所对应的路径是否存在
        if(!file.exists()){
            file.mkdir();
        }
        String finalPath=photoPath+File.separator+filename;
        photo.transferTo(new File(finalPath));

        return "success";
    }
}

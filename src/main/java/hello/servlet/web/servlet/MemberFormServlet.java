package hello.servlet.web.servlet;

import hello.servlet.domain.member.MemberRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "memberFormServlet", value = "/servlet/members/new-form")
public class MemberFormServlet extends HttpServlet {

    private final MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter writer = response.getWriter();
        writer.write("""
                <!DOCTYPE html>
                <html>
                    <head>
                        <meta charset=\"UTF-8\">
                        <title>Title</title>
                    </head>
                    <body>
                        <form action=\"/servlet/members/save\" method=\"post\">
                            username: <input type=\"text\" name=\"username\" />
                            age: <input type=\"text\" name=\"age\" />
                            <button type=\"submit\">전송</button>
                        </form>
                    </body>
                </html>
                """
        );
    }
}

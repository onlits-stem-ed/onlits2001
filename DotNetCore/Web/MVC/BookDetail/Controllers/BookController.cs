using Microsoft.AspNetCore.Mvc;
namespace BookDetail.Controllers
{
    public class BookController : Controller
    {
        public string ViewBook()
        {
            return "This is our first view";
        }
    }
}
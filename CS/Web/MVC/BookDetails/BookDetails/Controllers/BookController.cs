using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace BookDetails.Controllers
{
    public class BookController : Controller
    {
        // GET: Book
        public ActionResult CreateBook()
        {
            return View();
        }

        public ViewResult EditView()
        {
            return View();
        }

        public ViewResult EditBook()
        {
            return View();
        }
    }
}
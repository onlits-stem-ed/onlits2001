//using System;
// using System.Collections.Generic;
// using System.Diagnostics;
// using System.Linq;
// using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
// using Microsoft.Extensions.Logging;
// using FirstMVC.Models;

namespace FirstMVC.Controllers
{
    public class TestController : Controller
    {
        public IActionResult TestPage()
        {
            return View();
        }
    }
}
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace BookDetails.Models
{
    public class Book
    {
        public string BName { get; set; }
        public string BPrice { get; set; }
        public string BEdition { get; set; }
        public string BISBN { get; set; }
        public string BPublisher { get; set; }
    }
}